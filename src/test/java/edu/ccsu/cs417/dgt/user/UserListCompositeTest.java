package edu.ccsu.cs417.dgt.user;

import java.util.Iterator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curti
 */
public class UserListCompositeTest {

	UserListComposite comp;

	@Before
	public void setUp() {
		comp = new UserListComposite("List");
	}

	@After
	public void tearDown() {
		comp = null;
	}

	@Test
	public void nameSetterGetter_emptyConstructor_equalValue() {
		UserListComposite composite = new UserListComposite();
		String expected = "expected";
		composite.setName(expected);
		String actual = composite.getName();
		assertEquals(expected, actual);
	}

	@Test
	public void addUser_multipleUsersToList_returnMultipleUserToString() {
		UserInterface user1 = new BasicUser("Ashley");
		UserInterface user2 = new UserModDecorator(new BasicUser("Mitch"));
		comp.addUser(user1);
		comp.addUser(user2);
		String expResult = "UserListComposite [UserComposite [name=List, userList=[Ashley,Mitch], parent=null]]";
		String result = comp.toString();
		assertEquals(expResult, result);
	}

	@Test
	public void removeUser_noUserFound_returnNull() {
		UserInterface user = new BasicUser("Carol");
		UserInterface expected = null;
		UserInterface actual = comp.removeUser(user);
		assertEquals(expected, actual);
	}

	@Test
	public void removeUser_userRemoved_returnRemovedUser() {
		UserInterface expected = new BasicUser("Carol");
		comp.addUser(expected);
		UserInterface actual = comp.removeUser(expected);
		assertEquals(expected, actual);
	}

	@Test
	public void iteratorHasNext_emptyList_returnFalse() {
		Iterator<UserInterface> result = comp.iterator();
		boolean expected = false;
		boolean actual = result.hasNext();
		assertEquals(expected, actual);
	}

	@Test
	public void iteratorNext_NonEmptyList_returnUserInterface() {
		UserModDecorator sally = new UserModDecorator(new BasicUser("Sally"));
		BasicUser martin = new BasicUser("Martin");
		UserAdminDecorator george = new UserAdminDecorator(new BasicUser("George"));
		comp.addUser(sally);
		comp.addUser(martin);
		comp.addUser(george);
		Iterator<UserInterface> result = comp.iterator();
		result.next();
		UserInterface expected = martin;
		UserInterface actual = result.next();
		assertEquals(expected, actual);
	}

	@Test
	public void toString_emptyList_returnSimpleString() {
		String expected = "UserListComposite [UserComposite [name=List, userList=[], parent=null]]";
		String actual = comp.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void toString_nonEmptyListWithList_returnDetailString() {
		UserModDecorator sally = new UserModDecorator(new BasicUser("Sally"));
		UserAdminDecorator george = new UserAdminDecorator(new BasicUser("George"));
		UserListComposite list = new UserListComposite("Child List");
		BasicUser martin = new BasicUser("Martin");
		list.addUser(martin);
		comp.addUser(sally);
		comp.addUser(george);
		comp.addUser(list);
		String expected = "UserListComposite [UserComposite [name=List, userList=[Sally,George,Child List], parent=null]]";
		String actual = comp.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void hashCode_sameObjects_sameHashValues() {
		UserListComposite comp2 = new UserListComposite("List");
		int expected = comp.hashCode();
		int actual = comp2.hashCode();
		assertEquals(expected, actual);
	}

	@Test
	public void equals_null_returnFalse() {
		UserListComposite obj = null;
		boolean expected = false;
		boolean actual = comp.equals(obj);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_sameObject_returTrue() {
		boolean expected = true;
		boolean actual = comp.equals(comp);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_sameObjectConstructed_returnTrue() {
		boolean expected = true;
		UserListComposite other = new UserListComposite("List");
		UserModDecorator sally = new UserModDecorator(new BasicUser("Sally"));
		BasicUser martin = new BasicUser("Martin");
		UserAdminDecorator george = new UserAdminDecorator(new BasicUser("George"));
		comp.addUser(sally);
		comp.addUser(martin);
		comp.addUser(george);
		other.addUser(sally);
		other.addUser(martin);
		other.addUser(george);
		boolean actual = comp.equals(other);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_objectOneLessInList_returnFalse() {
		boolean expected = false;
		UserListComposite comp2 = new UserListComposite("List");
		UserModDecorator sally = new UserModDecorator(new BasicUser("Sally"));
		BasicUser martin = new BasicUser("Martin");
		UserAdminDecorator george = new UserAdminDecorator(new BasicUser("George"));
		comp.addUser(sally);
		comp.addUser(martin);
		comp.addUser(george);
		comp2.addUser(sally);
		comp2.addUser(martin);
		boolean actual = comp.equals(comp2);
		assertEquals(expected, actual);
	}

	@Test
	public void getComposite_noParent_returnSelf() {
		UserListComposite instance = new UserListComposite("List");
		UserComposite expected = instance;
		UserComposite actual = instance.getComposite();
		assertEquals(expected, actual);
	}

	@Test
	public void getComposite_hasParent_returnParent() {
		UserListComposite instance = new UserListComposite("List");
		UserComposite c = new UserListComposite("c");
		instance.setComposite(c);
		UserComposite expected = c;
		UserComposite actual = instance.getComposite();
		assertEquals(expected, actual);
	}
}
