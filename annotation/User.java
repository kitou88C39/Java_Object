import javax.annotation.processing.Generated;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column(nullable = false, unique = true)
    private String useName;

    @Column(nullable = false)
    private String password;

    // getter,setterなどは@Dataで自動作成される
}
