package com.example.OnlinePizzaManagement.exception;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler 
{
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,HttpHeaders headers,HttpStatus status,WebRequest request)
	{
		List<String> errorMessageDescription=ex.getBindingResult().getFieldErrors().stream().map((error->error.getDefaultMessage())).collect(Collectors.toList());
		return new ResponseEntity<>(errorMessageDescription,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value= {NullPointerException.class})
	public ResponseEntity<Object> handleNullPointerException(NullPointerException ex,WebRequest request)
	{
		String errorMessageDescription=ex.getLocalizedMessage();
		if(errorMessageDescription==null) errorMessageDescription=ex.toString();
		return new ResponseEntity<>(errorMessageDescription,new HttpHeaders(),HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value= {CustomerIdNotFoundException.class})
	public ResponseEntity<Object> handleCustomerIdNotFoundException(CustomerIdNotFoundException ex,WebRequest request)
	{
		String errorMessageDescription=ex.getLocalizedMessage();
		if(errorMessageDescription==null) errorMessageDescription=ex.toString();
		return new ResponseEntity<>(errorMessageDescription,new HttpHeaders(),HttpStatus.BAD_REQUEST);
	}

}







	
/*

@Override
protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
		                                                                   HttpHeaders headers,
		                                                                   HttpStatus status,
		                                                                   WebRequest request){
List<String> errors=ex.getBindingResult().getFieldErrors().stream().map((error->error.getDefaultMessage())).collect(Collectors.toList());

return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
*/



