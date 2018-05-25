public static class ChildOfOtherChild extends OtherChild {}

myfunction(new ArrayList<OtherChild>(), new Factory<ChildOfOtherChild>() {
    @Override public ChildOfOtherChild create() { return new ChildOfOtherChild(); }
  });
}