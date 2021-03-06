/**  
* <p>Title: SubjectStudy.java</p>
* <p>Description: </p> 
* @author pxx 
* @date 2019年3月26日  
*/  
package cc.zenking.cloud.subojetstudy.core.entity;

import lombok.Data;

/**  
* <p>Title: AchievementOrReport</p>  
* <p>Description:课题成果或报告表 subject_achievement_report</p>  
* @author pxx  
* @date 2019年3月26日  
*/
@Data
public class AchievementOrReport {
	
	/**
	 * 报告id或成果id
	 */
	private Integer id;
	
	/**
	 * 课题Id
	 */
	private Integer subjectId;
	
	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 课题报告或成果
	 */
	private String subjectReport;
	
	/**
	 * 课题类型;0是报告;1是成果
	 */
	private Integer type;
	
	/**
	 * 附件名称
	 */
	private String fileName;
	
	/**
	 * 附件地址
	 */
	private String filePath;
	
	/**
	 * 学校id
	 */
	private Integer tenantId;
	
	/**
	 * 操作者
	 */
	private Integer operator;
	
	/**
	 * 0是草稿;1是提交
	 */
	private Integer status;
}
