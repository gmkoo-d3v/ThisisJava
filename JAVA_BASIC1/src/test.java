package day11;

public class Ex2_While {

public static void main(String[] args) {

int i = 0;

while(i<31){

if(i % 7 == 0){

System.out.println();//줄 바꿈!

}else {

System.out.print(+i+" \t");

}

i++;

}

System.out.println();//줄 바꿈!

}

}