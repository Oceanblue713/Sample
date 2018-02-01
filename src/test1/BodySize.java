package test1;

class BodySize {
	private double weight;
	private double hight;

	BodySize(){
	}

	BodySize(double weight, double hight){
		this.weight = weight;
		this.hight = hight;
	}

	public double getWeight(){
		return weight;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}

	public double getHight(){
		return hight;
	}

	public void setHight(double hight){
		this.hight = hight;
	}
}
