@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    private UserDao dao;

    @InjectMock
    private UserService service;

    @Test
    public void testAddingUserWithLessThan8CharUsername () {
        final String username = "some";
        final String password = "user";
        doAnswer(new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
                Object[] args = invocationOnMock.getArguments();
                User toBeSaved = (User) args[0];
                Assert.assertEquals(username + "random", toBeSaved.getPassword());
                return null;
            }
        }).when(userDao).save(Matchers.any(User.class));
        service.addUser(username, password);
    }
}