import java.lang.CharSequence

String text = "Hello, World!"
println "text contains it: " + text.contains("World!")

if (text instanceof CharSequence) {
	println "text of type java.lang.String is an instance of java.lang.CharSequece"
	
	CharSequence charseq = (CharSequence)text
	println "charseq contains it: " + charseq.contains("World!")
}



