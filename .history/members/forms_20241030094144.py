from django import forms
rom .models import Employee

    class EmployeeForm(forms.ModelForm):
        class Meta:
            model = Employee
            fields = "__all__"