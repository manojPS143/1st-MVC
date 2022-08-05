package mobile;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class mobileSim {
	public static void main(String[] args) {
		
		Resource R=new ClassPathResource("NewFile.xml");
		BeanFactory BF=new XmlBeanFactory(R);
		mobile M =(mobile) BF.getBean("MPS");
		M.display();
		
	}

}
