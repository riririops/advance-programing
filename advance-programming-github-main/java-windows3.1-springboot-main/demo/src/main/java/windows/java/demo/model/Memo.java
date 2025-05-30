package windows.java.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * <p>メモ情報を表すエンティティクラスです。【未実装  】</p>
 *
 * @author YAMA
 * @since 1.0
 */
@Entity
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String content;

    private LocalDateTime createdAt = LocalDateTime.now();

    // --- getter/setter ---
    /**
     * メモIDの取得
     * @return メモID
     */
    public Long getId() { return id; }
    /**
     * メモIDの設定
     * @param id メモID
     */
    public void setId(Long id) { this.id = id; }
    /**
     * メモ内容の取得
     * @return メモ内容
     */
    public String getContent() { return content; }
    /**
     * メモ内容の設定
     * @param content メモ内容
     */
    public void setContent(String content) { this.content = content; }
    /**
     * 作成日時の取得
     * @return 作成日時
     */
    public LocalDateTime getCreatedAt() { return createdAt; }
    /**
     * 作成日時の設定
     * @param createdAt 作成日時
     */
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
