package basic;

public class StringSpecialization {
	   public static void main(String[] args) {
	        String[] a1 = {"dhan", "ai"};
	        String[] a2 = {"ml", "ai", "technology"};
	        String[] a3 = {"dhan"};

	        System.out.println(serializeStrings(a1));
	        System.out.println(serializeStrings(a2));
	        System.out.println(serializeStrings(a3));
	    }

	    public static String serializeStrings(String[] strings) {
	        StringBuilder serialized = new StringBuilder();

	        for (String s : strings) {
	            serialized.append(s.length()).append(s).append("=");
	        }

	        return serialized.toString();
	    }
	}

