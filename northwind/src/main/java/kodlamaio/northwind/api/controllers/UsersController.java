package kodlamaio.northwind.api.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.UserService;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.ErrorDataResult;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	private UserService userService;
	@Autowired
	public UsersController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody User user) {
		return ResponseEntity.ok(userService.add(user));
	}
	
	// spring validationdan gelen, bütün validaiton (doğrulama) hatalarını MethodAgumentNotValidException hatası olarak alır kontrol eder. 
	// .class = typeof()
	@ExceptionHandler(MethodArgumentNotValidException.class) 
	@ResponseStatus(HttpStatus.BAD_REQUEST) // Bu metod default olarak bad request döndürsün.
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		
		//Map = Dictionary yapısı. Map yapısı abstract'tır karışılığında class olarak HashMap yani Dictionary yapısını newleriz.
		Map<String, String> validationErrors = new HashMap<String, String>(); 		
		
		// Userdaki her bir alan için oluşan hataları oku. Fieldlarda oluşan hataların listesi
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) { 
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage()); // validationErrors' dictionary yapısına hataları sırası ile ekler.
		}
		
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, "Doğrulama hataları"); // Çıkan hataları kendi ErrorDataResult yapımıza döndürüyoruz.
		return errors;
	}

}

// 200 -> success (get)
// 201 -> success (add)
// 300 ->
// 400 -> bad request
// 500 -> internal server error