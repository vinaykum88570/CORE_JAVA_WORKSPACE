package EnumSet;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {

	enum Lang{
		JAVA, CSHARP,JAVASCRIPT,PYTHON,RUBY,
	}
	
	public static void main(String[] args) {
		
		// Creted a new enum set Using enum:
		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);
		System.out.println("_____________________________");
		
		// empty enum set:
		EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
		System.out.println(l);
		System.out.println("_____________________________");
		
		// range(e1,e2):
		EnumSet<Lang> enumRange = EnumSet.range(Lang.JAVA,Lang.JAVASCRIPT);
		System.out.println(enumRange);
		System.out.println("_____________________________");
		
		// Of:
		EnumSet<Lang> CSharpEnum = EnumSet.of(Lang.CSHARP);
		System.out.println(CSharpEnum);
		System.out.println("_____________________________");
		
		EnumSet<Lang> multipleEnum = EnumSet.of(Lang.JAVA,Lang.RUBY);
		System.out.println(multipleEnum);
		System.out.println("_____________________________");
		
		// add and addAll:
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
		lang2.add(Lang.JAVASCRIPT);
		lang2.addAll(lang1);
		System.out.println(lang2);
		System.out.println("_____________________________");
		
		// how to iterate EnumSet : Iterator:
		EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);
		
		Iterator<Lang> it = fullLang.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
			System.out.print(", ");
		}
		System.out.println("_____________________________");
		
		// remove() and removeAll():
		EnumSet<Lang> newLang = EnumSet.allOf(Lang.class);
		System.out.println(newLang);
		System.out.println("_____________________________");
		
		boolean b = newLang.remove(Lang.CSHARP);
		System.out.println(b);
		System.out.println(newLang);
		System.out.println("_____________________________");
		
		boolean b1 = newLang.removeAll(newLang);
		System.out.println(b1);
		System.out.println(newLang);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
