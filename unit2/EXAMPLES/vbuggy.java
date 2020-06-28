/* This file contains a number of fairly common mistakes, 
 * some of which are of the kind that you get by making typing mistakes,
 * and others of which are of the kind you get because a file gets into 
 * a strange state while you are debugging it. They can be found by following 
 * the compiler error messages. The compiler is usually quite good about 
 * locating the first mistake in a program, but a bit flaky after that. Don't 
 * try to correct two errors at once! */
class VBUGGY extends BASIC {
    public static main (string param[]) throws Exception {
        string name;
	//        int value;
        output.out = new(output);
        out.writeln("Hello. Please type your name:");
        name = input.readln();
        out.writeln("Now type a whole number:);
        value = input.readint();
        out.writeln("The square of your number is " + x*x);
        out.close()
    }
}
