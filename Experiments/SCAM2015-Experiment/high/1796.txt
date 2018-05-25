public enum Constants {

CONSTANT_STRING1("CONSTANT_VALUE1"), 
CONSTANT_STRING2("CONSTANT_VALUE2"), 
CONSTANT_STRING3("CONSTANT_VALUE3");
CONSTANT_FLAG1(false);
CONSTANT_FLAG2(true);

private String constants;
private boolean flag;

private Constants(String cons) {
this.constants = cons;
}

private Constants(boolean lFlag) {
this.flag= lFlag;
}
}