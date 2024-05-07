#include "MyForm.h"
#include "NewForm.h"
using namespace GUICPPKel37;

using namespace System;
using namespace System::Windows::Forms;
[STAThread]
void main(array<String^>^ args) {
	Application::EnableVisualStyles();
	Application::SetCompatibleTextRenderingDefault(false);
	GUICPPKel37::MyForm form;
	GUICPPKel37::NewForm^ newForm = gcnew GUICPPKel37::NewForm();
	Application::Run(% form);
}



