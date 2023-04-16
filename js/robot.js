function setup() {
    createCanvas(2000, 800);
    background(255, 192, 203);
}
    
function draw() {
    
//body 1
    strokeWeight(9);
    fill(255, 0, 255);
    triangle(350,450,450,250,550,450);
    line(415,320,300,330);
    line(300,330,370,400);
    line(485,320,600,250);
  //body 2
    strokeWeight(9);
    fill(255, 0, 255);
    triangle(1350,450,1450,250,1550,450);
    line(1415,320,1300,330);
    line(1300,330,1370,400);
    line(1485,320,1600,250);

    //flag 1
    fill(0, 0, 255)
    line(600,280,600,200);
    rect(600,200,90,30);
    //flag 2
    fill(0, 0, 255)
    line(1600,280,1600,200);
    rect(1600,200,90,30);

    //legs 1
    line(415,450,415,550);
    line(485,450,485,550);
    line(415,550,400,550);
    line(485,550,500,550);
    //legs 1
    line(1415,450,1415,550);
    line(1485,450,1485,550);
    line(1415,550,1400,550);
    line(1485,550,1500,550);

    
    //hat 1
    fill(128, 0, 128);
    rect(300,125,300,20);
    triangle(350,120,450,50,550,120);
    ellipse(450,50,30);
    //hat 2
    fill(128, 0, 128);
    rect(1300,125,300,20);
    triangle(1350,120,1450,50,1550,120);
    ellipse(1450,50,30)
  
    //face 1
    fill(220, 220, 220);
    arc(450,150,200,200, 0, PI); 
    //face 2
    fill(220, 220, 220);
    arc(1450,150,200,200, 0, PI); 

    //blush 1
    strokeWeight(5);
    fill(255, 20, 147);
    ellipse(400,200,30);  
    ellipse(500,200,30);
    //blush 2
    strokeWeight(5);
    fill(255, 20, 147);
    ellipse(1400,200,30);  
    ellipse(1500,200,30);

    //nose 1
    fill(255, 0, 0);
    triangle(440,200,450,180,460,200)
    //nose 2
    fill(255, 0, 0);
    triangle(1440,200,1450,180,1460,200)

    //eyes 1
    strokeWeight(15);
    point(420,180)
    point(480,180)
    //eyes 2
    strokeWeight(15);
    point(1420,180)
    point(1480,180)
    
    
    //mouth 1
    noFill();
    beginShape();
    strokeWeight(5);
    vertex(420, 215);
    vertex(430, 225);
    vertex(440, 215);
    vertex(450, 225);
    vertex(460, 215);
    vertex(470, 225);
    vertex(480,215);
    endShape();
    //mouth 2
    noFill();
    beginShape();
    strokeWeight(5);
    vertex(1420, 215);
    vertex(1430, 225);
    vertex(1440, 215);
    vertex(1450, 225);
    vertex(1460, 215);
    vertex(1470, 225);
    vertex(1480,215);
    endShape();

}
        

