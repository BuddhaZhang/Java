//�ӿ�
interface ComputeWeight{
	public abstract double computeWeight();
}
//����
class Television implements ComputeWeight{
	public double computeWeight() {
	
		return 500;
	}
}
//����
class Computer implements ComputeWeight{
	public double computeWeight() {
		
		return 450;
	}
}
//ϴ�»�
class WashMachine implements ComputeWeight{
	public double computeWeight() {
		
		return 390;
	}
}
//��������
class Car{
	ComputeWeight[] computeWeights=new ComputeWeight[3];
	Television television=new Television();
	Computer computer=new Computer();
	WashMachine washMachine=new WashMachine();
	public Car() {
		computeWeights[0]=television;
		computeWeights[1]=computer;
		computeWeights[2]=washMachine;
	}
	public void print() {
		System.out.println(computeWeights[0].computeWeight()+computeWeights[1].computeWeight()+computeWeights[2].computeWeight());
	}
}

public class Calculate {
	public static void main(String[] args) {
		Car car=new Car();
		car.print();;
	}
}
