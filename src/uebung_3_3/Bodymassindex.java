package uebung_3_3;

public class Bodymassindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Alter = 20;
		double Geschlecht = 0; // 0 = M�nnlich; 1 = Weiblich
		
		double K�rpergewicht = 70; //in Kilogramm
		double K�rpergr��e = 1.70; // in Meter
		
		double Bodymassindex = K�rpergewicht / (K�rpergr��e*K�rpergr��e);
		
		if (Alter<=24&&(Geschlecht==1)&&(Bodymassindex>=19)&&Bodymassindex<=24) 
		{ System.out.println("Ihr Bodymassindex befindet sich im Bereich f�r Normalgewicht."); }
		else { if (Alter<=34&&(Alter>=25)&&(Geschlecht==1)&&(Bodymassindex>=20)&&Bodymassindex<=25)
		{ System.out.println("Ihr Bodymassindex befindet sich im Bereich f�r Normalgewicht."); }
		else { if (Alter<=44&&(Alter>=35)&&(Geschlecht==1)&&(Bodymassindex>=21)&&Bodymassindex<=26)
		{ System.out.println("Ihr Bodymassindex befindet sich im Bereich f�r Normalgewicht."); }
		else { if (Alter<=54&&(Alter>=45)&&(Geschlecht==1)&&(Bodymassindex>=22)&&Bodymassindex<=27)
		{ System.out.println("Ihr Bodymassindex befindet sich im Bereich f�r Normalgewicht."); }
		else { if (Alter<=64&&(Alter>=55)&&(Geschlecht==1)&&(Bodymassindex>=23)&&Bodymassindex<=28)
		{ System.out.println("Ihr Bodymassindex befindet sich im Bereich f�r Normalgewicht."); }
		else { if (Alter>64&&(Geschlecht==1)&&(Bodymassindex>=24)&&Bodymassindex<=29)
		{ System.out.println("Ihr Bodymassindex befindet sich im Bereich f�r Normalgewicht."); } } } } } } 
		
		if (Alter<=24&&(Geschlecht==0)&&(Bodymassindex>=20)&&Bodymassindex<=25) 
		{ System.out.println("Ihr Bodymassindex befindet sich im Bereich f�r Normalgewicht."); }
		else { if (Alter<=34&&(Alter>=25)&&(Geschlecht==0)&&(Bodymassindex>=21)&&Bodymassindex<=26)
		{ System.out.println("Ihr Bodymassindex befindet sich im Bereich f�r Normalgewicht."); }
		else { if (Alter<=44&&(Alter>=35)&&(Geschlecht==0)&&(Bodymassindex>=22)&&Bodymassindex<=27)
		{ System.out.println("Ihr Bodymassindex befindet sich im Bereich f�r Normalgewicht."); }
		else { if (Alter<=54&&(Alter>=45)&&(Geschlecht==0)&&(Bodymassindex>=23)&&Bodymassindex<=28)
		{ System.out.println("Ihr Bodymassindex befindet sich im Bereich f�r Normalgewicht."); }
		else { if (Alter<=64&&(Alter>=55)&&(Geschlecht==0)&&(Bodymassindex>=24)&&Bodymassindex<=29)
		{ System.out.println("Ihr Bodymassindex befindet sich im Bereich f�r Normalgewicht."); }
		else { if (Alter>64&&(Geschlecht==0)&&(Bodymassindex>=25)&&Bodymassindex<=30)
		{ System.out.println("Ihr Bodymassindex befindet sich im Bereich f�r Normalgewicht."); } } } } } } 
		
		
		System.out.println("Ihr Bodymassindex betr�gt " + Bodymassindex);

	}

}
