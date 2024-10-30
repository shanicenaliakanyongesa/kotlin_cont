from django.shortcuts import redirect, render
from django.http import HttpResponse
from django.template import loader

from members.forms import EmployeeForm
from members.models import Employee
    # Create your views here.
def home(request):
    template = loader.get_template('home.html')
    return HttpResponse(template.render())
        #return HttpResponse("Hello World")
def players(request):
    template = loader.get_template('players.html')
    return HttpResponse(template.render())
def emp(request):
        if request.method == "POST":
            form = EmployeeForm (request.POST) # here "form" is one varible
            if form.is_valid():
                try:
                    form.save()
                    return redirect("/show")
                except:
                    pass
        else:
            form = EmployeeForm()
        return render(request,"index.html",{'form':form})  
    
def show(request):
        employees = Employee.objects.all() # it's select query,select all data store in employees varible
        return render(request,"show.html",{'employees': employees})     
 #gett       
def edit(request,id):
    employee = Employee.objects.get(id=id)
    return render(request,"edit.html",{'employee':employee})