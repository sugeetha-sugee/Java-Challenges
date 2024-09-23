package org.lang;
//child
public class LanguageInfo {
   private void tamilLanguage() {
	 System.out.println("My language is : Tamil");
}
   private void englishLanguage() {
	  System.out.println("My language is: English");
}
   private void hindiLanguage() {
	   System.out.println("My language is: Hindi");
}
   public static void main(String[] args) {
	LanguageInfo a=new LanguageInfo();
	a.englishLanguage();
	a.hindiLanguage();
	a.tamilLanguage();
	
	StateDetails b = new StateDetails();
	b.northIndia();
	b.southIndia();
}
}
