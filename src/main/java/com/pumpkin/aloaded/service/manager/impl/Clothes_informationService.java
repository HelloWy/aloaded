package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.dao.mapper.Clothes_informationMapper;
import com.pumpkin.aloaded.dao.model.Clothes_information;
import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.service.manager.IClothes_informationService;
import com.pumpkin.aloaded.utils.AutoCreateName;
import com.pumpkin.aloaded.utils.ExcelUtil;
/**
 * 衣装信息服务类
 * @author wuang
 *
 */
@Service
public class Clothes_informationService extends BaseService<Clothes_information> implements IClothes_informationService {
	
	@Autowired 
	Clothes_informationMapper mapper;
	/**
	 * @author wuang
	 * 查询所有的类似clothes_information的实体列表
	 * @param Clothes_information
	 * @return List<Clothes_information>
	 */
	public List<Clothes_information> findAll(Clothes_information clothes_information ,int currPage,int pageSize) {
		PageHelper.startPage(currPage,pageSize);
		return selectByList(clothes_information);
	}
	
	/**
	 * @author wuang
	 * 查询单位种类
	 * @return List<String>
	 * 
	 */
	public List<String> findTeam() {
		return mapper.selectTeam();
	}
	
	
	/**
	 * @author wuang
	 * 测试数据的插入，随机生成10条数据（不保证准确进库）
	 */
	public int insertThrends() {
		int s = -1;
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int iteam = random.nextInt(6)+6;
			String team = "七队";
			switch (iteam) {
			case 7:
				team = "七队";
				break;
			case 8:
				team = "八队";
				break;
			case 9:
				team = "九队";
				break;
			case 10:
				team = "十队";
				break;
			case 11:
				team = "十一队";
				break;
			case 12:
				team = "十二队";
				break;
			default:
				break;
			}
			String studentid = "201"+(random.nextInt(2)+2)+"81"+random.nextInt(3)+"0"+random.nextInt(5)+""+random.nextInt(10)+""+random.nextInt(10);
			@SuppressWarnings("static-access")
			String name = new AutoCreateName().createName();
			String identityid = "411282"+(1990+random.nextInt(6))+"0"+random.nextInt(10)+""+random.nextInt(2)+""+random.nextInt(10)+""+random.nextInt(10)+""+random.nextInt(10)+random.nextInt(10)+""+random.nextInt(10);
			String sex = random.nextInt(2)<1?"male":"female";
			String shengao = (150+random.nextInt(40))+"";
			String xiongwei = (70+random.nextInt(20))+"";
			String yaowei = (50+random.nextInt(20))+"";
			String tunwei = (75+random.nextInt(30))+"";
			Clothes_information clothes_information = new Clothes_information(team, studentid, name, identityid, sex, shengao, xiongwei, yaowei, tunwei);
			s = insert(clothes_information);
		}
		return s;
	}

	/**
	 * @author wuang
	 * 通过id查找一个实体
	 * @param String id
	 * @return Clothes_information
	 */
	public Clothes_information findOne(String id) {
		try {
			Clothes_information clothes_information = new Clothes_information();
			clothes_information.setId(Integer.parseInt(id));
			return selectByEntity(clothes_information);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			return null;
		}	
	}
	
	/**
	 * @author wuang
	 * 跟新一个实体
	 * @param Clothes_information 传入的实体必须含有id、name、studen_id、identy_id、sex等必填属性，且id需数据库中已存在，最好findtOne方法联合使用
	 * @return boolean
	 */
	public boolean updateOne(Clothes_information clothes_information) {
		try {
			updateByPrimaryKey(clothes_information);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	/**
	 * @author wuang
	 * 插入一个实体
	 * @param Clothes_information
	 * @return boolean true：成功  false：失败
	 */
	public boolean insertOne(Clothes_information clothes_information) {
		try {
			insert(clothes_information);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
	}
	
	
	/**
	 * @author wuang
	 * 数据表插入
	 * @param path 传入实际的xls位置路径例如：E:/ssss.xls
	 * @return 返回的值为null时表示导入数据库成功，
	 * 		         否则返回失败的student_id 且自该条后都不再插入数据库 
	 * 		        需提示用户修改该条并删除该条以上条目并重新上传！
	 */
	public String insertExcel(String path) {
		boolean s = false;
		ExcelUtil util = new ExcelUtil();
		List<Clothes_information> list = util.readEcxel(path);
		for (int i = 0; i < list.size(); i++) {
			try {
				s = insertOne(list.get(i));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("ssssssssssss");
			}
			if (!s) {
				return list.get(i).getStudentId();
			}
		}
		return null;
	}

	public boolean deleteOne(Clothes_information clothes_information) {
		try {
			deleteByEntity(clothes_information);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


}
