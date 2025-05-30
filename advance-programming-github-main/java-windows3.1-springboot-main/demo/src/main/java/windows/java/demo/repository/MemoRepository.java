package windows.java.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import windows.java.demo.model.Memo;

/**
 * Memoエンティティのためのリポジトリインターフェース。
 * <p>
 * Spring Data JPAを利用してメモ情報の永続化・検索を行う。
 */
@Repository
public interface MemoRepository extends JpaRepository<Memo, Long> {
    // 追加のクエリメソッドが必要な場合はここに定義
}
