package helpdesktest.resources.exeption;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import helpdesktest.services.exeption.ObjectNotFundExeption;

@ControllerAdvice
public class ResourceExeptionHendle {
	
	@ExceptionHandler(ObjectNotFundExeption.class)
	public ResponseEntity<StandardError> objectnotFundexeption(ObjectNotFundExeption ex,
			HttpServletRequest request){
		StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value()
				, "Object not found", ex.getMessage(),request.getRequestURI() );
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}

}
