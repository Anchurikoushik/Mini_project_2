package in.ashokit.service;

import in.ashokit.binding.LoginForm;
import in.ashokit.binding.SignUpForm;
import in.ashokit.binding.UnlockForm;

public interface UserService {
	
	public boolean signup(SignUpForm form);
	
	public boolean unlockAccount(UnlockForm form);
		
    public String login(LoginForm form);
    
    public boolean forgotPwd(String email);
    
	}


