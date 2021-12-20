package Exercicio1;
import java.util.Arrays;
import java.util.Collections;
public class exerVetor {

	public static void main(String[] args) {
		
	Integer[] a = {52,10,85,1324,01,13,62,30,12,127};
	
	a[0]=52;
	a[1]=10;
	a[2]=85;
	a[3]=1324;
	a[4]=01;
	a[5]=13;
	a[6]=62;
	a[7]=30;
	a[8]=12;
	a[9]=127;
	
	// Ordenar números em crescente
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
	
	// Ordenar números em decrescente
	Arrays.sort(a,Collections.reverseOrder());
	System.out.println(Arrays.toString(a));
		

	}

}
