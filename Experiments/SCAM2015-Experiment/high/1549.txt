//that's a shortcut, you'd have to calculate the max
int maxlength = tuna.Silverado.name().length();

for( tuna t : tuna.values() ) {
  System.out.format( "%-" + maxlength + "s   %-10s %4s\n", t.name(), t.getColor(), t.getYear() );
}