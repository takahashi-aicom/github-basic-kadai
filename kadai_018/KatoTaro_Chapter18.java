package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	public void setGivenName() {
        this.givenName = "太郎"; 
    }
    
    public KatoTaro_Chapter18() {
        setGivenName();
    }

	@Override
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
	
}
