package com.jmotto.logic.als.exception;

public class JmottoAlsExceptionResponse {

	private boolean success;
	
	private DetailedErrorMessage detailedText;

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	public DetailedErrorMessage getDetailedErrorMessage() {
		return detailedText;
	}

	public void setDetailedErrorMessage(DetailedErrorMessage detailedText) {
		this.detailedText = detailedText;
	}

	@Override
	public String toString() {
		return "ClassPojo [success = " + success + ", error = " + detailedText + "]";
	}
}
