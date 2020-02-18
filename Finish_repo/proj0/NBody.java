public class NBody{
	public static double readRadius(String fileName){
		In planets = new In(fileName);
		int num = planets.readInt();
		double radius = planets.readDouble();
		// double xxPos = planets.readDouble();
		// double yyPos = planets.readDouble();
		// double xxVel = planets.readDouble();
		// double yyVel = planets.readDouble();
		// double mass = planets.readDouble();
		// String imgFileName = planets.readString();
		return radius;
	}

	/**It is ok to return Body[]*/
	public static Body [] readBodies(String fileName){
		double xxPos,yyPos,xxVel,yyVel,mass;
		String imgFileName;
		In planets = new In(fileName);
		int num = planets.readInt();
		double radius = planets.readDouble();
		/**Array declaration?*/
		Body [] arr = new Body [num];
		/**Creating a Class array, remember to new Class for each element*/
		/**Only read 5 lines, no comment line*/
		for(int i=0;i<num;i++){
				xxPos = planets.readDouble();
				yyPos = planets.readDouble();
				xxVel = planets.readDouble();
				yyVel = planets.readDouble();
				mass = planets.readDouble();
				imgFileName = planets.readString();
				// System.out.println(xxPos);
				arr[i] = new Body(xxPos,yyPos,xxVel,yyVel,mass,imgFileName);	
			}
		return arr;
	}
	// public static void drawBackground(double r){
	// 	StdDraw.enableDoubleBuffering();
	// 	StdDraw.setScale(-r, r);
	// 	StdDraw.picture(0,0,"images/starfield.jpg");

	// }
	public static void main(String[] args) {
		/**Read in cmd args!*/
		double T = Double.parseDouble(args[0]);
		double dT = Double.parseDouble(args[1]);
		String filename = args[2];

		Body[] arr = readBodies(filename);
		double r = readRadius(filename);
		int N = arr.length;

		StdDraw.setScale(-r, r);
		StdDraw.picture(0, 0, "images/starfield.jpg");

		for (Body b : arr)
			b.draw();

		StdDraw.enableDoubleBuffering();
		double time =0;
        while(T>=time) {
			double[] xForces = new double[N];
			double[] yForces = new double[N];
			for(int i=0;i<N;i++){
	        	xForces[i] = arr[i].calcNetForceExertedByX(arr);
	        	yForces[i] = arr[i].calcNetForceExertedByY(arr);
			}
//			System.out.println(xForces[0]);
//			System.out.println(yForces[0]);
			for(int i=0;i<N;i++)
	        	arr[i].update(dT,xForces[i],yForces[i]);
			StdDraw.picture(0,0,"images/starfield.jpg");
			for(int i=0;i<N;i++)
	        	arr[i].draw();
			StdDraw.show();
			StdDraw.pause(10);
			time+=dT;
       		}


	    	StdOut.printf("%d\n", arr.length);
			StdOut.printf("%.2e\n", r);
			for (int i = 0; i < arr.length; i++) {
				StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
							  arr[i].xxPos, arr[i].yyPos, arr[i].xxVel,
							  arr[i].yyVel, arr[i].mass, arr[i].imgFileName);
			}

	}
}