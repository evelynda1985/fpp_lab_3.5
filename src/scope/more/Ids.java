package scope.more;

public class Ids {
	static boolean isBadId(String s){
		if(s == null) return false;
		for(String t : badIds){
			if(s.equals(t)) return true;
		}
		return false;
	}
	static boolean isGoodId(String s){
		if(s == null) return false;
		for(String t : goodIds){
			if(s.equals(t)) return true;
		}
		return false;
	}
	static boolean isManagerId(String s){
		if(s == null) return false;
		for(String t : managerIds){
			if(s.equals(t)) return true;
		}
		return false;
	}	
	private Ids(){}
	private final static String[] badIds = 
		{"001", 
		"008", 
		"013", 
		"023", 
		"084", 
		"134", 
		"157", 
		"282", 
		"477", 
		"581", 
		"600", 
		"921"
		};
	
	private final static String[] goodIds = 
		{"002", 
		"004", 
		"011", 
		"020", 
		"081", 
		"194", 
		"197", 
		"222", 
		"377", 
		"511", 
		"620", 
		"821"
		};
	private final static String[] managerIds = 
		{"005", 
		"012", 
		"014", 
		"100", 
		"200", 
		"333", 
		};
}
