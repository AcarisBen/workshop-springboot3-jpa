package com.acaris.course.entities.enums;

public enum OrderStatus {
	/* -> Caso prefira adicionar o nome do Enum ao invés do número específico:
	 
	  WAITING_PAYMENT("Waiting"),
	  PAID("Paid"),
	  SHIPPED("Shipped"),
	  DELIVERED("Delivered"),
	  CANCELED("Canceled");
	  
	  private String code;
	  
	  private OrderStatus(String code) {
	  this.code = code;
	  }
	  
	  public String getCode() {
	  return code;
	  }
} 	 */

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
