@Repository
public interface UseRepository extends JpaRepository<User, Long> {
    // ユーザーIDをキーにユーザ情報を取得する
    User findByUserId(String userId);
}
