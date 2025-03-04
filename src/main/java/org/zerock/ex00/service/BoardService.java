package org.zerock.ex00.service;
import org.zerock.ex00.domain.BoardVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.ex00.mappers.BoardMapper;

@Service
@Log4j2
@RequiredArgsConstructor
@Transactional
public class BoardService {

    private final BoardMapper boardMapper;

    public Long register(BoardVO boardVO) {

     log.info("=====================");

        int count = boardMapper.insert(boardVO);

        return boardVO.getBno();

    }

    public java.util.List<BoardVO> list(){

        return boardMapper.getList();

    }

    public BoardVO get(Long bno) {

        return boardMapper.select(bno);
    }

    public boolean modify(BoardVO vo) {
        return boardMapper.update(vo) == 1;
    }

    public boolean remove(Long bno) {
        return true;
    }
}
