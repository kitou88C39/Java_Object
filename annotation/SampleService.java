@Service
public class SampleService {
    @Autowired
    private UserRepository userRepository;

    public User getUserInfo() {
        // ユーザーIDが1のユーザ情報を取得
        User userInfo = userRepository.findByUserId("1");
        // ユーザ情報を返却
        return userInfo;
    }
}
