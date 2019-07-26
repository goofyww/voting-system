/**  
 *
 */  
package com.example.gf.exception;

/**
 * <p>Title: DataException</p>  
 * <p>Description: 自定义数据库异常类</p>  
 * @author gf
 * @created 2018年4月21日 下午8:13:12
 */
public class DataException extends Exception {

	/** serialVersionUID*/  
	private static final long serialVersionUID = 7616453800913611675L;

	public DataException() {
		// TODO Auto-generated constructor stub
	}

	public DataException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DataException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public DataException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
