package instanceofkeyword;
/**
 * An object of subclass type is also type of parent class.
 * For example,if Dog extends Animal then object of Dog can be referred by either Dog or Animal class.
 * @author Jo
 *
 */
class Simple1 {

	public static void main(String[] args) {
		Simple1 s1 = new Simple1();
		System.out.println(s1 instanceof Simple1);//true
	}

}
