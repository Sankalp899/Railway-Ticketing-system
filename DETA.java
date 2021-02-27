 import java.awt.*;
class FLIGHT extends Frame
{
Label fid,fna,src,dep,flc,fch,sts,des,art,dt,msg;
TextField RAILWAY_ID,TRAIN_NAME,SOURCE,DEPARTURE,COACH,BOOKING_CHARGES,SEATS,DESTINATION,ARRIVAL_TIME,DATE;
Button b1,b2,b3,b4;
public FLIGHT()

{
setTitle("BOOKING_DETAILS");
setBackground(Color.white);
setLayout(null);
fid=new Label("RAILWAY_ID");
fna=new Label("TRAIN_NAME");
src=new Label("SOURCE");
dep=new Label("DEPARTURE");
flc=new Label("COACH");
fch=new Label("BOOKING_CHARGES");
sts=new Label("SEATS");
des=new Label("DESTINANTION");
art=new Label("ARRIVAL_TIME");
dt=new Label("DATE");
msg=new Label("KEEP SOCIAL DISTANCE!!!");
Font f=new Font("Arial",Font.BOLD,15);
fid.setFont(f);
fna.setFont(f);
src.setFont(f);
dep.setFont(f);
flc.setFont(f);
fch.setFont(f);
sts.setFont(f);
des.setFont(f);
art.setFont(f);
dt.setFont(f);
msg.setFont(f);
fid.setBounds(20,50,150,40);
fna.setBounds(20,100,150,40);
src.setBounds(20,150,150,40);
dep.setBounds(20,200,150,40);
flc.setBounds(20,250,150,40);
fch.setBounds(20,300,150,40);
sts.setBounds(20,350,150,40);
des.setBounds(600,50,150,40);
art.setBounds(600,100,150,40);
dt.setBounds(600,150,150,40);
msg.setBounds(20,20,150,40);

add(fid);
add(fna);
add(src);
add(dep);
add(flc);
add(fch);
add(sts);
add(des);
add(art);
add(dt);
add(msg);

RAILWAY_ID=new TextField("",20);
TRAIN_NAME=new TextField("",20);
SOURCE=new TextField("",20);
DEPARTURE=new TextField("",20);
COACH=new TextField("",20);
BOOKING_CHARGES=new TextField("",20);
SEATS=new TextField("",20);
DESTINATION=new TextField("",20);
ARRIVAL_TIME=new TextField("",20);
DATE=new TextField(" ",20);

RAILWAY_ID.setBounds(200,50,200,20);
TRAIN_NAME.setBounds(200,100,200,20);
SOURCE.setBounds(200,150,200,20);
DEPARTURE.setBounds(200,200,200,20);
COACH.setBounds(200,250,200,20);
BOOKING_CHARGES.setBounds(200,300,200,20);
SEATS.setBounds(200,350,200,20);
DESTINATION.setBounds(800,50,200,20);
ARRIVAL_TIME.setBounds(800,100,200,20);
DATE.setBounds(800,150,200,20);
add(RAILWAY_ID);
add(TRAIN_NAME);
add(SOURCE);
add(DEPARTURE);
add(COACH);
add(BOOKING_CHARGES);
add(SEATS);
add(DESTINATION);
add(ARRIVAL_TIME);
add(DATE);
Font fa=new Font("Ariel",Font.BOLD,15);
b1=new Button("SEARCH");
b2=new Button("ADD");
b3=new Button("UPADTE");
b4=new Button("DELETE");
b1.setBounds(170,430,100,30);
b2.setBounds(300,430,100,30);
b3.setBounds(430,430,100,30);
b4.setBounds(570,430,100,30);
b1.setBackground(Color.pink);
b2.setBackground(Color.pink);
b3.setBackground(Color.pink);
b4.setBackground(Color.pink);
add(b1);
add(b2);
add(b3);
add(b4);
b1.setFont(fa);
b2.setFont(fa);
b3.setFont(fa);
b4.setFont(fa);
setSize(1500,600);
setVisible(true);
}
}
class DETA
{
public static void main(String args[])
{
FLIGHT obj=new FLIGHT();
}
}