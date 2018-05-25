Thread.State state = getThreadInQuestion().getState();
if(state == Thread.State.BLOCKED) {
    System.out.println("Blocked");
} else {
    System.out.println("Not blocked");
}