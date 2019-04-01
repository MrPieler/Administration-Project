package enggaarden.app.models.interfaces;

import enggaarden.app.models.Entities.Member;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import java.util.List;

/*
Lavet af alle
*/

public interface MemberRepositoryInterface {

    SqlRowSet getMember();
    SqlRowSet getMember(int id);
    void postMember(Member member);
    void updateMember(Member member);
    void deleteMember(int id);
    void resetSubscriptions();
    List<String> getMemberTypes();
}
