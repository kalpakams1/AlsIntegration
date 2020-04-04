package com.jmotto.logic.als.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(JmottoAlsException.class)
	protected ResponseEntity<JmottoAlsExceptionResponse> handleRepRestControllerException(final JmottoAlsException exception) {
		JmottoAlsExceptionResponse alsIntExceptionResponse = new JmottoAlsExceptionResponse();
		DetailedErrorMessage detailedText = new DetailedErrorMessage();
		if(null == exception.getErrorKey()) {
			detailedText.setCode(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
		}
		else {
			detailedText.setCode(exception.getErrorKey());
		}
		detailedText.setMessage(buildErrorMessage(exception));
		detailedText.setTarget(exception.getTarget());
		alsIntExceptionResponse.setSuccess(false);
		alsIntExceptionResponse.setDetailedErrorMessage(detailedText);
		return new ResponseEntity<JmottoAlsExceptionResponse>(alsIntExceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	private String buildErrorMessage(JmottoAlsException exception){
		String formattedMessage = "Issue in ALS Integration Application - "+ exception.getMessage();
		return formattedMessage;
	}
}
