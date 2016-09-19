package edu.mum.volunteers.bootstrap;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import edu.mum.volunteers.models.Administrator;
import edu.mum.volunteers.models.Beneficiary;
import edu.mum.volunteers.models.Offer;
import edu.mum.volunteers.models.Project;
import edu.mum.volunteers.models.ProjectStatus;
import edu.mum.volunteers.models.Resource;
import edu.mum.volunteers.models.ResourceType;
import edu.mum.volunteers.models.Task;
import edu.mum.volunteers.models.User;
import edu.mum.volunteers.models.Volunteer;
import edu.mum.volunteers.repositories.BeneficiaryRepository;
import edu.mum.volunteers.repositories.OfferRepository;
import edu.mum.volunteers.repositories.ProjectRepository;
import edu.mum.volunteers.repositories.ResourceRepository;
import edu.mum.volunteers.repositories.TaskRepository;
import edu.mum.volunteers.repositories.UserRepository;

@Component
public class UsersLoader implements ApplicationListener<ContextRefreshedEvent> {

    private UserRepository userRepository;
	private ProjectRepository projectRepository;
	private TaskRepository taskRepository;
	private ResourceRepository resourceRepository;
	private BeneficiaryRepository beneficiaryRepository;
	private Logger log = Logger.getLogger(UsersLoader.class);
	private OfferRepository offerRepository;
    @Autowired
    public void setProductRepository(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }
   
    @Autowired
	public void setProjectRepository(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}
   
    @Autowired
	public void setTaskRepository(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
   
    @Autowired
	public void setResourceRepository(ResourceRepository resourceRepository) {
		this.resourceRepository = resourceRepository;
	}
    
   
    @Autowired
	public void setBeneficiaryRepository(BeneficiaryRepository beneficiaryRepository) {
		this.beneficiaryRepository = beneficiaryRepository;
	}
    
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
    

    @Autowired
    public void setProductRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
   
      @Autowired
  	public void setOfferRepository(OfferRepository offerRepository) {
  		this.offerRepository = offerRepository;
  	}
  	
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

    	/*User volunteer = new Volunteer();
		volunteer.setEmail("sahib.zer@gmail.com");
		volunteer.setFirstName("Sahib Zar");
		volunteer.setLastName("Khan");
		userRepository.save(volunteer);
		log.info("Saved User - id: " + volunteer.getId());
		//admin
		User admin = new Administrator();
		admin.setEmail("meetsahib88@gmail.com");
		admin.setFirstName("Sahib Zar");
		admin.setLastName("Khan");
		userRepository.save(admin);
        log.info("Saved User - id:" + admin.getId());
        
        Project project = new Project();
		Task task = new Task();
		project.setDescription("A test project");
		project.setName("Test BOOT Project");
		admin = userRepository.findByUserType("Administrator");
		project.setUser((Administrator) admin);
		project.setStatus(ProjectStatus.NOT_STARTED);
		
		
		Resource resource = new Resource();
		resource.setDescription("Developer who know backend and frontend both. A full stack developer");
		resource.setResourceType(ResourceType.SKILL);
		resource.setName("Skill Required");
		resourceRepository.save(resource);
		log.info("Saved Resource id:"+resource.getId());
		
		task.setHoursToComplete(19);
		task.setPercentCompleted(0);
		
		taskRepository.save(task);
		log.info("Saved Task id:"+task.getId());
		
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setDescription("Facebook Incroporation is a largest social network");
		beneficiary.setName("FB");
		beneficiaryRepository.save(beneficiary);
		log.info("Saved Beneficiary id:"+beneficiary.getId());
		project.getBeneficiaries().add(beneficiary);
		project.getResources().add(resource);
		project.getTasks().add(task);
		//persist resource
		projectRepository.save(project);
		log.info("Saved Project id:"+project.getId());
        
		Offer offer = new Offer();
		volunteer = userRepository.findByUserType("Volunteer");
		offer.setUser((Volunteer) volunteer);
		
		offer.getTasks().add(taskRepository.findOne(1));
		offerRepository.save(offer);*/
    }
}
