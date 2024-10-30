#from django.urls import path: This imports the path function from Django's URL module, which is used to define URL patterns.
#
from django.urls import path
from . import views

urlpatterns = [
    path('home/', views.home, name='home'),
    path('players/', views.players, name='players'),
    path('emp', views.emp, name='employees'),
    path('show', views.show, name='show'),
    path('edit/<id>', views.edit, name='edit'),
 path('update/<id>', views.update, name='update'),
     path('delete/<id>/', views.delete, name='delete'),
]