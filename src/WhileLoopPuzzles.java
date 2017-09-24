import org.jointheleague.graphical.robot.Robot;




public class WhileLoopPuzzles {
	int one = 1;
	int days = 0;
	
	String bw = "black";
	Boolean b = true;
	
	double start = 1046.0;
	int times = 0;
	
	Robot r;
public static void main(String[] args) {
	WhileLoopPuzzles x = new WhileLoopPuzzles();
}
WhileLoopPuzzles(){
	//1
	//while (one <= 1000000) {
	//	one *= 2;
	//	days += 1;
//	}
//	System.out.println(days);

    //2
//   while (b == true){
//	   System.out.println(bw);
//	   bw = "white";
//	   System.out.println(bw);
//	   bw = "black";
  // }
  // 3
  // while (start >= 1){
	//   start /= 2;
//	   times += 1;
	  
 //  }
 //  System.out.println(times);
//}
//4
	r = new Robot();
	r.penDown();
	r.setX(20);
	r.setSpeed(10);
	r.miniaturize();
	for (int i = 0; i < 5; i++) {
		r.move(30);
		r.turn(360 - (360/5));
	}
}}

	
