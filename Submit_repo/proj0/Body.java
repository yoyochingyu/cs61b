public class Body{
    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;
    // public static double gravity = 6.67*Math.pow(10,-11);
    public static double gravity = 6.67e-11;

    public Body(double xP,double yP, double xV, double yV, double m, String img){
        xxPos=xP;    
        yyPos=yP;    
        xxVel=xV;    
        yyVel=yV;
        mass = m;
        imgFileName = img;    
    }
    public Body(Body b){
        xxPos=b.xxPos;    
        yyPos=b.yyPos;    
        xxVel=b.xxVel;    
        yyVel=b.yyVel;
        mass = b.mass;
        imgFileName = b.imgFileName;  
    }
    public double calcDistance(Body b){
        double xPow, yPow, r;
        xPow = Math.pow(this.xxPos - b.xxPos,2);
        yPow = Math.pow(this.yyPos - b.yyPos,2);
        r = Math.sqrt(xPow+yPow);
        return r;
    }
    public double calcForceExertedBy(Body b){
        double rPow,force;
        rPow = Math.pow(this.calcDistance(b),2);
        force =gravity*this.mass*b.mass/rPow;
        return force;

    }
    public double calcForceExertedByX(Body b){
        double dX,r,fX;
        dX = b.xxPos-this.xxPos;
        r = this.calcDistance(b);
        fX = this.calcForceExertedBy(b)*dX/r;
        return fX;
    }
    public double calcForceExertedByY(Body b){
        double dY,r,fY;
        dY = b.yyPos-this.yyPos;
        r = this.calcDistance(b);
        fY = this.calcForceExertedBy(b)*dY/r;
        return fY;
    }
    public double calcNetForceExertedByX(Body[] bodies){
        double netForceX=0;
        for(int i=0;i<bodies.length;i++){
            // if(this.xxPos == bodies[i].xxPos)
            if(this.equals(bodies[i]))
                continue;
            netForceX += this.calcForceExertedByX(bodies[i]);
        }
        return netForceX;
    }
    public double calcNetForceExertedByY(Body[] bodies){
        double netForceY=0;
        for(int i=0;i<bodies.length;i++){
            if(this.yyPos == bodies[i].yyPos)
            // if(this.equals(bodies[i]))
                continue;
            netForceY += this.calcForceExertedByY(bodies[i]);
        }
        return netForceY;
    }
    public void update(double dt,double fX, double fY){
        double aX,aY;
        aX = fX/this.mass;
        aY = fY/this.mass;
        this.xxVel = this.xxVel + dt * aX;
        this.yyVel = this.yyVel + dt * aY;
        this.xxPos = this.xxPos + dt * xxVel;
        this.yyPos = this.yyPos + dt * yyVel;
    }
    public void draw() {
        String fileName = "./images/" + imgFileName;
        StdDraw.picture(xxPos, yyPos, fileName);
    } //draw

}