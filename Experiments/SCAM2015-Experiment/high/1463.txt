public static int mulAndCheck( int a, int b )
{
    int ret;
    String msg = "overflow: multiply";
    if ( a > b )
    {
        // use symmetry to reduce boundry cases
        ret = mulAndCheck( b, a );
    }
    else
    {
        if ( a < 0 )
        {
            if ( b < 0 )
            {
                // check for positive overflow with negative a, negative b
                if ( a >= Integer.MAX_VALUE / b )
                {
                    ret = a * b;
                }
                else
                {
                    throw new ArithmeticException( msg );
                }
            }
            else if ( b > 0 )
            {
                // check for negative overflow with negative a, positive b
                if ( Integer.MIN_VALUE / b <= a )
                {
                    ret = a * b;
                }
                else
                {
                    throw new ArithmeticException( msg );

                }
            }
            else
            {
                // assert b == 0
                ret = 0;
            }
        }
        else if ( a > 0 )
        {
            // assert a > 0
            // assert b > 0

            // check for positive overflow with positive a, positive b
            if ( a <= Integer.MAX_VALUE / b )
            {
                ret = a * b;
            }
            else
            {
                throw new ArithmeticException( msg );
            }
        }
        else
        {
            // assert a == 0
            ret = 0;
        }
    }
    return ret;
}

@Test( expected = ArithmeticException.class )
public void testOverflow()
{
    mulAndCheck( Integer.MAX_VALUE, Integer.MAX_VALUE );
}

@Test( expected = ArithmeticException.class )
public void testOverflow1()
{
    mulAndCheck( Integer.MIN_VALUE, Integer.MAX_VALUE );
}

@Test
public void testTimesMinus1()
{
    Assert.assertEquals( Integer.MIN_VALUE + 1, mulAndCheck( Integer.MAX_VALUE, -1 ) );
    Assert.assertEquals( Integer.MAX_VALUE, mulAndCheck( Integer.MIN_VALUE + 1, -1 ) );
}