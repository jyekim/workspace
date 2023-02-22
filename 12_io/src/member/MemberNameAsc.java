package member;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MemberNameAsc implements Member {

	@Override
	public void execute(List<MemberDTO> list) {
		Collections.sort(list);
	}
}

