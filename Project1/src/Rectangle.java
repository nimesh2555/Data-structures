
 class Rectangle extends Shape {
	
	private int rect_length;
	private int rect_width;
	
	
	public int getRect_length() {
		return rect_length;
	}


	public void setRect_length(int rect_length) {
		this.rect_length = rect_length;
	}


	public int getRect_width() {
		return rect_width;
	}


	public void setRect_width(int rect_width) {
		this.rect_width = rect_width;
	}


	void calculate_area() {
		// TODO Auto-generated method stub
			int area = getRect_length() * getRect_width();
			System.out.println("area = "+area);
	}

}
