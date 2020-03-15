package com.jmotto.logic.als.exception;

public class JmottoAlsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String errorKey;
	private final String target;

	/**
	 * Creates JmottoAlsException which will be caught by the handler to
	 * send an error response to the user
	 * 
	 * @param errorKey
	 *            Error definition key defined in error definition files.
	 * @param target
	 *            The field that is caused or related to error
	 */
	public JmottoAlsException(final String errorKey, final String target) {
		super(errorKey);
		this.errorKey = errorKey;
		this.target = target;
	}

	/**
	 * @param errorKey
	 */
	public JmottoAlsException(final String errorKey) {
		super(errorKey);
		this.errorKey = errorKey;
		this.target = null;
	}
	
	/**
	 * @return the errorKey
	 */
	public String getErrorKey() {
		return this.errorKey;
	}

	/**
	 * @return the target
	 */
	public String getTarget() {
		return this.target;
	}
}
