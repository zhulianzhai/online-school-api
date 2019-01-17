package com.liuxu.online.service;

import java.util.List;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.liuxu.online.entity.MyScore;
import com.liuxu.online.entity.MyTest;



public interface IMyTestService extends IService<MyTest> {
    /**
     * 插入操作
     * @param test
     * @return
     * @throws Exception
     */
	boolean insertTest(MyTest test) throws Exception;
    /**
     * 查询所有
     * @param queryParams
     * @return
     */
	List<MyTest> selectTest();
	
	List<MyScore> selectMyScoreById(Long testId);
	
	public List<MyScore> selectMyScore();
	
	
	public Page<MyTest> getPageNotice(Page<MyTest> page);
	
	
   
}
