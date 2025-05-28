package org.example.SymplifyingConditionalExpressions.DecomposeConditional;

public class Access {
    public void checkAccess(User user, Resource resource){
        if(isAccessAllowed(user,resource))
            grantAccess();
        else
            denyAccess();
    }

    private boolean isAccessAllowed(User user, Resource resource){
        return user.isLoggedIn() && user.hasPermission(resource);

    }

    private void denyAccess(){
        System.out.println("Access denied");
    }
    private void grantAccess(){
        System.out.println("Access granted");
    }
}
